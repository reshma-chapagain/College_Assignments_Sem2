#loop over number from 1 to 100 if number is divisible by 3 print fizz
#if numbrt is divisible by 5 print buzz
#if number is divisible by both 3 and 5 print fizzbuzz
#else print the num

for number in range(1,101):
    if number % 3 ==0 and number % 5 == 0:
        print("Fizzbuzz")
        
    elif number % 3 == 0:
        print("fizz")
        
    elif number % 5 == 0:
        print("bizz")
    else:
        print(number)
        
        #0.1+0.2 in python answer is y