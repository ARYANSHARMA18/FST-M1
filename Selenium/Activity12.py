from selenium import webdriver
from selenium.webdriver import ActionChains
from selenium.webdriver.common.by import By

with webdriver.Firefox() as driver:
    driver.get("https://training-support.net/webelements/drag-drop")
    actions = ActionChains(driver)

    print(driver.title)

    ball = driver.find_element(By.ID,"ball")
    zone1 = driver.find_element(By.ID,"dropzone1")
    zone2 = driver.find_element(By.ID,"dropzone2")

    actions.drag_and_drop(ball,zone1).pause(2).perform()

    if driver.find_element(By.XPATH,"//div[@id='dropzone1']/span").text == 'Dropped!' :
        print("Ball dropped to Zone 1 ")

    actions.drag_and_drop(ball,zone2).pause(2).perform()

    if driver.find_element(By.XPATH,"//div[@id='dropzone2']/span").text == 'Dropped!' :
        print("Ball dropped to Zone 2 ")

driver.quit()