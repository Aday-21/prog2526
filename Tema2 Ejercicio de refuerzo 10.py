def comparacionTrue(a, b, c):
    if len(a) != len(b) \
    or len(a) != len(c) \
    and len(b) != len(c):
        return False
    
    for i in range(len(a)):
        if a[i].lower() != b[i].lower() \
        or a[i].lower() != c[i].lower() \
        and c[i].lower() != b[i].lower():
            return False
    
    return True
  
    
# Ejemplo que devolvería True:
a = ["h","o","l","a"]
b = ["H","o","l","a"]
c = ["H","O","L","A"]

# Ejemplo que devolvería False:
aa = ["h","o","l"]
bb = ["H","o","l","a"]
cc = ["H","O","L","A"]

# Ejemplo que devolvería False:
aaa = ["h","o","l","a"]
bbb = ["H","o","l","a"]
ccc = ["A","D","I","O"]


print(comparacionTrue(a, b, c))