from selenium import webdriver
from selenium.webdriver.support.wait import WebDriverWait
from selenium.webdriver.support import expected_conditions
from selenium.webdriver.common.by import By

with webdriver.Firefox() as driver:
    driver.get("https://training-support.net/webelements/tabs")
    wait = WebDriverWait(driver, timeout=10)

    print(driver.title)

    print("Current Window Handle: ",driver.current_window_handle)

    driver.find_element(By.XPATH,"//button[contains(text(),'Open A New Tab')]").click()

    wait.until(expected_conditions.new_window_is_opened)

    handles = driver.window_handles

    print("Window handles present: ", handles)

    for handle in handles : 
        driver.switch_to.window(handle)

    print("Current Window Handle: ",driver.current_window_handle)

    driver.find_element(By.XPATH,"//button[contains(text(),'Open Another One')]").click()

    wait.until(expected_conditions.new_window_is_opened)

    handles = driver.window_handles

    print("Window handles present: ", handles)

    driver.find_element(By.XPATH,"//button[contains(text(),'Open Another One')]").click()

    driver.quit()