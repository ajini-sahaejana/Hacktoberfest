f=open("Paragraph.txt","r")
dic={}
x=f.read()
d=x.strip().split(" ")
for item in d:
    if item in dic:
        dic[item]=dic[item]+1
    else:
        dic[item]=1
f.close()
print(dic)
