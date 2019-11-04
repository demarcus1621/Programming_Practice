def main():
    myDict = dict()
    temp = input()
    while not temp == "***":
        if temp in myDict.keys():
            myDict[temp] += 1
        else:
            myDict[temp] = 1
        temp = input()
        
    values = sorted(myDict, key=myDict.__getitem__, reverse=True)
    if myDict[values[0]] == myDict[values[1]]:
       print("Runoff!")
    else:
       print(values[0])
        

if __name__ == "__main__":
    main()