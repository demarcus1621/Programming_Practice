def main():
	x_coord = int(input())
	y_coord = int(input())
	
	if x_coord > 0 and y_coord > 0:
		print(1)
	elif x_coord > 0 and y_coord < 0:
		print(4)
	elif x_coord < 0 and y_coord < 0:
		print(3)
	else:
		print(2)
		
if __name__ == "__main__":
	main()