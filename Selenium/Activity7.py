from selenium import webdriver
from selenium.webdriver.common.by import By

with webdriver.Firefox() as driver:
    driver.get("https://training-support.net/webelements/dynamic-controls")

    print(driver.title)

    textBox = driver.find_element(By.ID,"textInput")

    print("Textbox is enabled: ",textBox.is_enabled())

    textInputButton = driver.find_element(By.ID,"textInputButton")
    textInputButton.click()

    print("After Clicking ---> Textbox is enabled: ",textBox.is_enabled())

    textBox.send_keys("Now enabled")
    print(textBox.get_attribute("value"))

    driver.quit()