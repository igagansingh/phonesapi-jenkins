pipelineJob('pipelineJob') {
    definition {
        cps {
            script(readFileFromWorkspace('pipelineJob.groovy'))
            sandbox()
        }
    }
}
pipelineJob('phones-api-job') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url 'https://github.com/igagansingh/PhonesAPI.git'
                    }
                    branch 'dev'
                }
            }
        }
    }
}