from selenium import webdriver
from selenium.webdriver.support.wait import WebDriverWait
from selenium.webdriver.support import expected_conditions
from selenium.webdriver.common.by import By

with webdriver.Firefox() as driver:
    driver.get("https://training-support.net/webelements/dynamic-controls")
    wait = WebDriverWait(driver,timeout=10)

    print(driver.title)

    checkbox = driver.find_element(By.ID,"checkbox")
    print("Is checkbox visible: " , checkbox.is_displayed())

    toggleCheckbox = driver.find_element(By.XPATH,"//button[text()='Toggle Checkbox']")
    toggleCheckbox.click()

    wait.until(expected_conditions.invisibility_of_element(checkbox))
    print("Is checkbox visible: " , checkbox.is_displayed())

    toggleCheckbox.click()

    wait.until(expected_conditions.visibility_of(checkbox)).click()
    print("Is checkbox selected: " , checkbox.is_selected())
    
    driver.quit()