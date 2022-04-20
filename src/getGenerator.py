print("type '%' to stop")
print("Enter list. <TYPE> <VARIBLE>")
varss=[]

x=""
while x!="%":
    x=input("><>")
    if x=="%":
        break
    varss.append(x.strip().split(" "));

for er in varss:
    print("public "+er[0]+" get"+er[1].capitalize()+"(){return "+er[1]+"}")

