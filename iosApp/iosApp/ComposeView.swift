import Foundation
import shared
import SwiftUI

struct ComposeView: UIViewControllerRepresentable{
    func updateUIViewController(_ uiViewController: UIViewControllerType, context: Context) {
        
    }
    
     private let lifecycleRegistry: LifecycleRegistry

     init(lifecycleRegistry: LifecycleRegistry) {
         self.lifecycleRegistry = lifecycleRegistry
     }
    
    func makeUIViewController(context: Context) -> some UIViewController {
        MainAppKt.MainApp(lifecycleRegistry: self.lifecycleRegistry)
    }
}
