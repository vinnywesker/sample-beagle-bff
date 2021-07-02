import {
  Grid,
  AppBar,
  Toolbar,
  Typography,
  makeStyles
} from '@material-ui/core'
import MenuIcon from '@material-ui/icons/Menu'
import React from 'react'

const useStyles = makeStyles((theme) => ({
  root: {
    flexGrow: 1
  },
  menuButton: {
    marginRight: theme.spacing(2)
  },
  title: {
    flexGrow: 1
  }
}))

const Container: React.FC = ({ children }) => {
  const classes = useStyles()
  return (
    <Grid container direction="column">
      <Grid item xs>
        <AppBar position="static">
          <Toolbar>
            <MenuIcon />
            <div
              style={{
                paddingLeft: 25
              }}
            >
              <Typography variant="h6" className={classes.title}>
                Tecnoanjo Application
              </Typography>
            </div>
          </Toolbar>
        </AppBar>
      </Grid>
      <Grid item xs>
        {children}
      </Grid>
    </Grid>
  )
}

export default Container
