package com.github.adrijaned.intellijvhdlplugin.services

import com.github.adrijaned.intellijvhdlplugin.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
