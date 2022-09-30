def binarysearch(lt,low,high,key):
    if low<=high:
        mid=(low+high)//2
        if lt[mid]==key:
            return mid
        elif lt[mid]<key:
            return binarysearch(lt,mid+1,high,key)
        else:
            return binarysearch(lt,low,mid-1,key)
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

