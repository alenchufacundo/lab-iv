const axios = require('axios')
const { request, response } = require('express')
const { URL_BASE } = require('../constants/constants')
const { get } = require('../routes/peliculas')

const getCapitals = (req = request, res = response) => {
    const {country = '', capital = ''} = req.query
    console.log(country, capital)


    axios.get(URL_BASE + '/capital.json')
        .then((response) => {
            const { data = [] } = response
            // handle success
            console.log(data);

            res.status(200).json({
                msg: 'Ok',
                data
            })
        })
        .catch((error) => {
            // handle error
            console.log(error)
            res.status(400).json({
              msg: 'Error',
              error
            })
          })
        }

        module.exports = {
            getCapitals
        }