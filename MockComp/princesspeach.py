def main():
    count,num = input().split()
    myList = list()
    for i in range(int(num)):
        temp = eval(input())
        if temp not in myList:
            myList.append(temp)
    for i in range(int(count)):
        if i in myList:
            continue
        print(i)
    print("Mario got " + str(len(myList)) + " of the dangerous obstacles.")
    
if __name__ == "__main__":
    main()