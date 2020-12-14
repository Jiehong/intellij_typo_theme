package com.github.jiehong.intellijtypotheme.services

import com.intellij.openapi.project.Project
import com.github.jiehong.intellijtypotheme.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
