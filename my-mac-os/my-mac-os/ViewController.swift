//
//  ViewController.swift
//  my-mac-os
//
//  Created by crux on 15/6/2019.
//  Copyright © 2019 crux. All rights reserved.
//

import Cocoa

class ViewController: NSViewController {
    var text : NSText!

    override func viewDidLoad() {
        super.viewDidLoad()
        // Do any additional setup after loading the view.

        let text = NSText(frame: CGRect(x: 0, y: 0, width: 300, height: 21))
        text.isEditable = false
        text.alignment = .center
        self.text = text
        view.addSubview(text)
        
        let button = NSButton(frame: CGRect(x: 0, y: 200, width: 300, height: 21))
        button.setAccessibilityTitle("button")
        button.action = #selector(buttonClick)
        view.addSubview(button)
    }

    override var representedObject: Any? {
        didSet {
        // Update the view, if already loaded.
        }
    }

    @objc func buttonClick(text: NSText) {
        self.text.string = "Hello World!"
    }
}

