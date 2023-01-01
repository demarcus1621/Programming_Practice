def main():
    [ print(i, end="") for i in [ "" + x[0].upper() for x in input().split("-") ] ]

if __name__ == "__main__":
    main()