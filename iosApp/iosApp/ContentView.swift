import SwiftUI
import shared

struct ContentView: View {
    private let lifecycleRegistry: LifecycleRegistry

    init(_ lifecycleRegistry: LifecycleRegistry) {
        self.lifecycleRegistry = lifecycleRegistry
    }

	var body: some View {
        ComposeView(lifecycleRegistry: self.lifecycleRegistry)
	}
}
