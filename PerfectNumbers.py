number = int(input("Enter a number: "))
counter = 0
sum = 0

while counter < (number - 1):
    counter += 1
    if number % counter == 0:
        sum += counter
   #     print(sum, end = ' ')
        print(counter, end = ', ')

print("\nSum is ", sum)
        

if sum == number:
    print("\nThis is a perfect number")
elif sum < number:
    print("\nThis is a deficient number")
else:
    print("\nThis is an abundant number")
        
