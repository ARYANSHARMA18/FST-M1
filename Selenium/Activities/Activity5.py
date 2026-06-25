from selenium import webdriver
from selenium.webdriver.common.by import By

with webdriver.Firefox() as driver:
    driver.get("https://training-support.net/webelements/dynamic-controls")

    print(driver.title)

    checkbox = driver.find_element(By.ID,"checkbox")

    print("Checkbox is visible: ",checkbox.is_displayed())

    toggleCheckbox = driver.find_element(By.XPATH,"//button[text()='Toggle Checkbox']")
    toggleCheckbox.click()

    print("After Clicking ---> Checkbox is visible: ",checkbox.is_displayed())

    driver.quit()