def main():
    num_stones = int(input())
    print("Bob", end="") if num_stones % 2 == 0 else print("Alice", end="")

if __name__ == "__main__":
    main()