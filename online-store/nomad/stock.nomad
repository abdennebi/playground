job "stock" {
  datacenters = ["dc1"]
  type = "service"
  update {
    stagger = "5s"
    max_parallel = 1
  }

  group "stock" {
    task "stock" {
       env {
            PORT = "80"
            
        }
        driver = "docker"
        config {
            image = "abdennebi/stock-service:1.0.0-SNAPSHOT"
        }
        
      resources {
        cpu = 500
        memory = 64
        network {
          mbits = 1

          port "http" {
            static = 80
          }
        }
      }
    }
  }
}
