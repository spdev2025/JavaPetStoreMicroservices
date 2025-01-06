# Local Dev. Env. Kubernetes Selection: Minikube/Kind/K3s

## Minikube
- More features, more resources.
- Ideal for exploring Kubernetes capabilities, testing applications that require a robust Kubernetes environment, or working with various add-ons.
- IDE support (particularly for VSCode).

## Kind
- Short for Kubernetes in Docker, hence if you already have Docker, it's a faster install (but on Windows, it might also require the Chocolatey package manager - `winget install Kubernetes.kind` failed for me).
- No need for a VM manager; faster start compared to Minikube.
- Excellent for CI/CD or quick try-and-delete experiments.
- Downside: you can’t pause the cluster.

## K3s
- Extra small footprint (under 100MB), but no native Windows option.
- “The go-to solution for developers targeting edge computing, IoT devices, or low-resource applications. Its lightweight nature makes it the preferred choice when Kubernetes must operate seamlessly on less powerful hardware.”
