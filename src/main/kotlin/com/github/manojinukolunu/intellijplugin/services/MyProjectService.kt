package com.github.manojinukolunu.intellijplugin.services

import com.github.manojinukolunu.intellijplugin.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
