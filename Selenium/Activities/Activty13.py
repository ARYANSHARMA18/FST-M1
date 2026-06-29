from selenium import webdriver
from selenium.webdriver.common.by import By

with webdriver.Firefox() as driver:
    driver.get("https://training-support.net/webelements/tables")

    print(driver.title)

    rows = driver.find_elements(By.XPATH,"//table[contains(@class,'table-auto')]/thead/tr/th")
    cols = driver.find_elements(By.XPATH,"//table[contains(@class,'table-auto')]/tbody/tr")

    print("No. of rows are " , len(rows))
    print("No. of cols are " , len(cols))

    thirdRow = driver.find_element(By.XPATH,"//table[contains(@class,'table-auto')]/tbody/tr[3]");
    print("Value in row 3: " , thirdRow.text)

    secondRowSecondCol = driver.find_element(By.XPATH,"//table[contains(@class,'table-auto')]/tbody/tr[2]/td[2]");
    print("Value in row 3: " , secondRowSecondCol.text)

    driver.quit()