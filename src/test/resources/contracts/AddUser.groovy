import org.springframework.cloud.contract.spec.Contract

Contract.make {
    request {
        method POST()
        headers {
            header('Content-Type': 'application/json')
        }
        url ('/users')
        body('''
            {
                "firstName" : "Serhii",
                "lastName" : "Trehubenko",
                "email" : "tsa88.ca@gmail.com",
                "password": "password"
            }
        '''
        )
    }
    response {
        status 200
        headers {
            header('Content-Type': 'application/json')
        }
        body('''"New User was successfully created with Id:[1]"''')
    }
}