#Json's Gems

#Input number of Gems
n = int(input())

#Input number on gems
arr = [int(x) for x in input().split()]

#flag keeps check of consecutive numbers on gems
flag = arr[0]
end = arr[len(arr)-1]

#Iterate through the array and check
for i in arr:

    if(i==flag) and flag!=end:
        flag+=1
        
    elif flag==end:
        print(arr[0]-1)
        break
        
    else:
        print(flag)
        break
