package com.github.mximp.testplugin.services

import com.intellij.openapi.project.Project
import com.github.mximp.testplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
