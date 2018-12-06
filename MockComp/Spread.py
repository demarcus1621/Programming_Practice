def main():
	cases = int(input())
	for i in range(cases):
		en = raw_input().split(" ")
		s = int(en[0])
		d = int(en[1])
		#highest = s
		#lowest = 0
		hasFound = False
		for x in range(s):
			highest = s - x
			if abs(highest - x) == d:
				if highest > x:
					print str(highest) + " " + str(x)
				else:
					print str(x) + " " + str(highest)
				hasFound = True
				break
		if( not hasFound ):
			print "impossible"
	
main()