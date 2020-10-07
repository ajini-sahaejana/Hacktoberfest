x=str(input("Enter a phrase: "))
a=0
e=0
p=0
o=0
u=0
for i in x:
    if i=="a" or i=="A":
        a=a+1
    elif i=="e" or i=="E":
        e=e+1
    elif i=="i" or i=="I":
        p=p+1
    elif i=="o" or i=="O":
        o=o+1
    elif i=="u" or i=="U":
        u=u+1
print("\n","No of a's =",a,"\n","No of e's =",e,"\n","No of i's =",p,"\n","No of o's =",o,"\n","No of u's =",u,)
