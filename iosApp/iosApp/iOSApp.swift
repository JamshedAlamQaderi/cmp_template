import SwiftUI
import shared

@main
struct iOSApp: App {
    private let lifecycleRegistry: LifecycleRegistry
    
    init() {
        self.lifecycleRegistry = LifecycleRegistryKt.LifecycleRegistry()
    }

	var body: some Scene {
		WindowGroup {
            ContentView(self.lifecycleRegistry)
            .onReceive(NotificationCenter.default.publisher(for: UIApplication.didBecomeActiveNotification)) { _ in
                LifecycleRegistryExtKt.resume(self.lifecycleRegistry)
            }
            .onReceive(NotificationCenter.default.publisher(for: UIApplication.willResignActiveNotification)) { _ in
                LifecycleRegistryExtKt.pause(self.lifecycleRegistry)
            }
            .onReceive(NotificationCenter.default.publisher(for: UIApplication.didEnterBackgroundNotification)) { _ in
                LifecycleRegistryExtKt.stop(self.lifecycleRegistry)
            }
            .onReceive(NotificationCenter.default.publisher(for: UIApplication.willTerminateNotification)) { _ in
                LifecycleRegistryExtKt.destroy(self.lifecycleRegistry)
            }
		}
	}
}
