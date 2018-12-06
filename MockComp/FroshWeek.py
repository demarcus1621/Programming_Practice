def main():
	i = raw_input()
	n = int(i.split(" ")[0])
	m = int(i.split(" ")[1])
	tasks = raw_input().split(" ")
	quiet = raw_input().split(" ")
	
	tasks.sort(reverse=True)
	quiet.sort(reverse=True)
	counter = 0
	tax = 0 
	x = 0
	
	while ( x < m and x + tax < n):
		if int(tasks[x + tax]) <= int(quiet[x]):
			counter += 1
		else:
			for k in range(n - x):
				if int(tasks[k + x]) <= int(quiet[x]):
					counter += 1
					tax = k
					break
		x += 1
	print counter
	
main()