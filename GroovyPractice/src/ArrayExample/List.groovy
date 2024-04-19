def list=[]
println list.size()

def list1=new ArrayList<String>()

def list2=[1,2,3,4,5]

list.add("sp");
list.add("prasanth")
println list

list.push("geb")
list.push("selenium")
println list

list.putAt(0,"LTIMIndtree")
println list

println list[1]
println list.get(0)

list.remove(2)
list.remove("prasanth")
println list
list=list -"geb"
println list
def list5=[1,2,3,2,3,2,3]
println list5.count(3)
println list5.sort()