import ObjectCreation.ObjectDemo
def obj=new ObjectDemo()
obj.methodOne()
def objtwo=new ObjectDemo(name:'dhoni',place:'chennai')
println objtwo.getName()
println objtwo.getPlace()
objtwo.setName("Selenium automation")
println objtwo.getName()