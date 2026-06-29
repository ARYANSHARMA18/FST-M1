from selenium import webdriver
from selenium.webdriver.support.wait import WebDriverWait
from selenium.webdriver.support import expected_conditions
from selenium.webdriver.common.by import By

with webdriver.Firefox() as driver:
    driver.get("https://training-support.net/webelements/dynamic-attributes")
    wait = WebDriverWait(driver,timeout=10)

    print(driver.title)

    fullNameField = driver.find_element(By.CSS_SELECTOR,"input[id^='full-name-']")
    emailField = driver.find_element(By.CSS_SELECTOR,"input[id$='-email']")
    eventField = driver.find_element(By.CSS_SELECTOR,"input[name*='-event-date-']")
    additionDetailField = driver.find_element(By.CSS_SELECTOR,"textarea[id*='-additional-details-']")

    fullNameField.send_keys("Selenium")
    emailField.send_keys("selenium.learning@eamil.com")
    eventField.send_keys("2026-07-29")
    additionDetailField.send_keys("Hey! we're learning Selenium...")

    driver.find_element(By.XPATH,"//button[text()='Submit']").click()

    message = wait.until(expected_conditions.visibility_of(driver.find_element(By.ID,"action-confirmation"))).text

    print("Confirmation Message: " , message)
    
    driver.quit()