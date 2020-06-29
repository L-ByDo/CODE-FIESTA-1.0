#Input number of hills
n = int(input())

#Input height of each separated by spaces
arr = [int(x) for x in input().split()]

#Even and odd hill height count
even = 0
odd = 0

#Iterate through the array starting for second till second last hill
for i in range(1,len(arr)-1):
	
    if arr[i] > arr[i-1] and arr[i] > arr[i+1]:
    
        if arr[i]%2 == 0:
            even += 1
            
        else:
            odd += 1
            
    else:
        continue
        
print('even {}'.format(even))
print('odd {}'.format(odd))
