N = int(input())
items = list(map(int, input().rstrip().split()))
A = int(input())
items.sort()
c=0
sum =0
  
for i in range(0,len(items)-1):
    sum += items[i]
    if(sum>=A):
        break  
if(sum>=A):
    print("{0:.2f}".format(sum-(sum*0.3)))
else:
    print("You cannot avail offer")
        
        