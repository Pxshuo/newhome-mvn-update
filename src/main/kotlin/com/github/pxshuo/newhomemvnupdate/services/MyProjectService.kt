package com.github.pxshuo.newhomemvnupdate.services

import com.intellij.openapi.project.Project
import com.github.pxshuo.newhomemvnupdate.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
