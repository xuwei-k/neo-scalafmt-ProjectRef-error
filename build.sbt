val b = ProjectRef(file("a"), "b")

val c = project.dependsOn(b)
