from selenium import webdriver
from selenium.webdriver import ActionChains
from selenium.webdriver.common.by import By

with webdriver.Firefox() as driver:
    driver.get("https://training-support.net/webelements/mouse-events")
    actions = ActionChains(driver)

    print(driver.title)
    
    cargoLock = driver.find_element(By.XPATH,"//h1[text()='Cargo.lock']")
    cargoToml = driver.find_element(By.XPATH,"//h1[text()='Cargo.toml']")
    scr = driver.find_element(By.XPATH,"//h1[text()='src']")
    target = driver.find_element(By.XPATH,"//h1[text()='target']")

    actions.click(cargoLock).pause(1).move_to_element(cargoToml).click().pause(1).perform()

    confirmationText = driver.find_element(By.ID,"result").text

    print("Confirmation Text: ",confirmationText)

    actions.double_click(scr).pause(1).context_click(target).pause(1).perform()

    actions.click(driver.find_element(By.XPATH, ("//div[@id='menu']/div/ul/li[1]"))).pause(2).perform()

    confirmationText = driver.find_element(By.ID,"result").text

    print("Confirmation Text: ",confirmationText)

    driver.quit()