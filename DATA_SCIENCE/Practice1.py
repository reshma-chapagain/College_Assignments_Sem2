#list of numbers {1,2,3,4,5,6} without using inbuilt functions find mean of the list of numbers.

numbers = {1,2,3,4,5,6}

sum = 0
count = 0

for num in numbers:
    sum +=num
    count +=1
    
mean = sum/count

print("Mean:", mean)