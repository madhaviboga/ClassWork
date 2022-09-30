def insertionsort(arr):
    for i in range(1,len(arr)):
        x=arr[i]
        j=j-1
        while j>=0 and x<arr[j]:
            arr[j+1]=arr[j]
            j==1
            arr[j+1]=x
    return arr
n=int(input("enter size of an array:"))
l=[]
for i in range(n):
    ele=int(input("enter element:"))
    l.append(i)
print(insertionsort(l))