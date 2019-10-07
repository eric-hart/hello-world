//
//  ViewController.swift
//  my-ios-app
//
//  Created by crux on 17/2/2019.
//  Copyright © 2019 crux. All rights reserved.
//

import UIKit

class ViewController: UIViewController {
    var label : UILabel!
    
    override func viewDidLoad() {
        super.viewDidLoad()
        let label = UILabel(frame: CGRect(x: 0, y: 0, width: 300, height: 21))
        label.center = CGPoint(x: 160, y: 285)
        label.textAlignment = .center
        label.font = label.font.withSize(25)
        self.label = label
        view.addSubview(label)
        
        let button = UIButton(frame: CGRect(x: 0, y: 200, width: 300, height: 21))
        button.center = CGPoint(x: 240, y: 485)
        button.backgroundColor = UIColor.darkGray
        button.setTitle("button", for: UIControlState.normal)
        button.setTitleColor(UIColor.black, for: UIControlState.normal)
        button.addTarget(self, action: #selector(buttonClick(label:)), for: UIControlEvents.touchUpInside)
        view.addSubview(button)
        // Do any additional setup after loading the view, typically from a nib.
    }
    
    override func didReceiveMemoryWarning() {
        super.didReceiveMemoryWarning()
        // Dispose of any resources that can be recreated.
    }
    
    @objc func buttonClick(label: UILabel) {
        self.label.text = "Hello World!"
    }
}
