from selenium import webdriver
from selenium.webdriver.support.wait import WebDriverWait
from selenium.webdriver.support import expected_conditions
from selenium.webdriver.common.by import By

with webdriver.Firefox() as driver:
    driver.get("https://training-support.net/webelements/alerts")
    wait = WebDriverWait(driver, timeout=10)

    print(driver.title)

    promptBtn = driver.find_element(By.ID,"prompt")
    promptBtn.click()

    wait.until(expected_conditions.alert_is_present())
    alert = driver.switch_to.alert

    print("Text in alert is: " , alert.text)

    alert.send_keys("Awesome!")

    alert.accept()
    print("Confirmation Text : " , driver.find_element(By.ID, "result").text)

    driver.quit()