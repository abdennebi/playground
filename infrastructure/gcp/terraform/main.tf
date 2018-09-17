// Create the GKE Cluster
resource "google_container_cluster" "primary" {
  name               = "playground"
  zone               = "${var.zone}"
  initial_node_count = 2

  node_config {
    oauth_scopes = [
      "https://www.googleapis.com/auth/compute",
      "https://www.googleapis.com/auth/devstorage.read_only",
      "https://www.googleapis.com/auth/logging.write",
      "https://www.googleapis.com/auth/monitoring",
    ]
  }
}
