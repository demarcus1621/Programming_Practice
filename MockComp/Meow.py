def check(x, y):
	return x % y == 0
	
def main():
	i = int(raw_input())
	highest = 1
	for x in range(1,i/2):
		if(check(i, x)):
			if(check(i/x, x)):
				if(check(i/x**2, x)):
					if(check(i/x**3, x)):
						if(check(i/x**4, x)):
							if(check(i/x**5, x)):
								if(check(i/x**6, x)):
									if(check(i/x**7, x)):
										if(check(i/x**8, x)):
											highest = x
	print highest
	
main()