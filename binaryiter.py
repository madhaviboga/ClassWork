def binarysearch(lt,low,high,key):
    while low<=high:
        mid=(low+high)//2
        if lt[mid]==key:
            return mid
        elif lt[mid]>key:
            high=mid-1
        else:
            low=mid+1
    return -1
lt=[7,8,9,10,15,16]
l=0
h=len(lt)-1
key=int(input("enter key"))
res=binarysearch(lt,l,h,key)
if res==-1:
    print("ele not found")
else:
    print("ele found at",res)
