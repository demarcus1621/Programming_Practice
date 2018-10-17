def main():
	inp = raw_input().split(" ")
	pfoot = int(inp[0])
	pbulb = int(inp[1])
	inp = raw_input().split(" ")
	m = int(inp[0])
	sig = int(inp[1])
	max = pfoot + pbulb
	x = 1
	y = 1
	while( x + 1 <= m ):
		if( 2 * x + 1 >= sig ):
			if (pfoot * x + pbulb > max):
				max = pfoot * x + pbulb
		x += 1
		
	x = 1
	
	while( 1 + y <= m ):
		if( 2 + y >= sig ):
			if (pfoot + pbulb * y > max):
				max = pfoot + pbulb * y
		y += 1
		
	
	y = 1
	
	while( x + y <= m ):
		if( 2 * x + y >= sig ):
			if (pfoot * x + pbulb * y > max):
				max = pfoot * x + pbulb * y
		x += 1
		y += 1
	
	print max
	
main()