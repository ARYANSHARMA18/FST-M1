from selenium import webdriver
from selenium.webdriver.support.wait import WebDriverWait
from selenium.webdriver.support import expected_conditions
from selenium.webdriver.common.by import By

with webdriver.Firefox() as driver:
    driver.get("https://training-support.net/webelements/popups")
    wait = WebDriverWait(driver, timeout=10)

    print(driver.title)

    driver.find_element(By.ID,"launcher").click()

    wait.until(expected_conditions.element_to_be_clickable((By.ID,"username")))

    driver.find_element(By.ID,"username").send_keys("admin")
    driver.find_element(By.ID,"password").send_keys("password")
    driver.find_element(By.XPATH,"//button[contains(text(),'Submit')]").click()

    print("Login message: " , driver.find_element(By.CSS_SELECTOR,"h2.mt-5").text)

    driver.quit()