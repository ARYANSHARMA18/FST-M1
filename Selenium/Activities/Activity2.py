from selenium import webdriver
from selenium.webdriver.common.by import By

with webdriver.Firefox() as driver:
    driver.get("https://training-support.net/webelements/login-form/")

    print("Title of the page is:", driver.title)

    driver.find_element(By.NAME,"username").send_keys("username")
    driver.find_element(By.NAME,"password").send_keys("password")

    driver.find_element(By.XPATH,"//button[text()='Submit']").click()

    driver.quit()