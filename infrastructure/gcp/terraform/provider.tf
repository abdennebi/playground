// Configures the Google Cloud Provider with default settings
provider "google" {
  project = "${var.project}"
  version = "~> 1.13"
}
