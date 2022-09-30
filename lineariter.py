def linearsearch(l,n,key):
    for i in range(0,n):
        if(l[i]==key):
            return i
    return -1
n=int(input("enter the size"))
l=[]
for i in range(0,n):
    ele=int(input("enter elements"))
    l.append(ele)
print(l)
key=int(input("enter key"))
res=linearsearch(l,n,key)
if res==-1:
    print("ele not found")
else:
    print("ele found at:",res)