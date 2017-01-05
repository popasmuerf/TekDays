package com.tekdays

class SecurityFilters {

    def filters = {
        all(controller:'*', action:'*') {
            before = {

            }
            after = { Map model ->

            }
            afterView = { Exception e ->

            }
        }
       
        loginCheck(controller:'*', action:'*'){
            before = {
                if (!controllerName)
                    return true
                def allowedActions = ['show', 'index', 'login',
                                      'validate']		  
                if (!session.user && !allowedActions.contains(actionName)){
                    redirect(controller:'tekUser', action:'login',
                             params:['cName': controllerName,
                                     'aName':actionName])
                    return false
                }
            }
        }
    } 
}

